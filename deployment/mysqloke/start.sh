#!/bin/bash
kubectl create namespace mysqloke
kubectl apply -f mysql-all.yml -n mysqloke
kubectl apply -f mysql-client-job.yml -n mysqloke
kubectl apply -f k8s-all.yml -n mysqloke
exit
