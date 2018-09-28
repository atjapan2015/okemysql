#!/bin/bash
kubectl create namespace mysqlcs
kubectl apply -f mysql-all.yml -n mysqlcs
kubectl apply -f mysql-client-job.yml -n mysqlcs
kubectl apply -f k8s-all.yml -n mysqlcs
exit
