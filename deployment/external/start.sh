#!/bin/bash
kubectl create namespace remote
kubectl apply -f mysql-all.yml -n remote
kubectl apply -f mysql-client-job.yml -n remote
kubectl apply -f k8s-all.yml -n remote
exit
