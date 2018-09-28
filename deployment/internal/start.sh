#!/bin/bash
kubectl create namespace local
kubectl apply -f mysql-all.yml -n local
kubectl apply -f mysql-client-job.yml -n local
kubectl apply -f k8s-all.yml -n local
exit
