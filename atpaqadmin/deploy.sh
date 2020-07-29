#!/bin/bash

SCRIPT_DIR=$(dirname $0)

echo create atpaqadmin deployment and service...
export CURRENTTIME=$( date '+%F_%H:%M:%S' )
echo CURRENTTIME is $CURRENTTIME  ...this will be appended to generated deployment yaml

cp atpaqadmin-deployment.yaml atpaqadmin-deployment-$CURRENTTIME.yaml

sed -i "s|%DOCKER_REGISTRY%|${DOCKER_REGISTRY}|g" atpaqadmin-deployment-${CURRENTTIME}.yaml
sed -i "s|%ORDER_PDB_NAME%|${ORDER_PDB_NAME}|g" atpaqadmin-deployment-${CURRENTTIME}.yaml
sed -i "s|%INVENTORY_PDB_NAME%|${INVENTORY_PDB_NAME}|g" atpaqadmin-deployment-${CURRENTTIME}.yaml

if [ -z "$1" ]; then
    kubectl create -f $SCRIPT_DIR/atpaqadmin-deployment-generated.yaml -n msdataworkshop
else
    kubectl create -f <(istioctl kube-inject -f $SCRIPT_DIR/atpaqadmin-deployment-generated.yaml) -n msdataworkshop
fi

kubectl create -f $SCRIPT_DIR/atpaqadmin-service.yaml -n msdataworkshop

