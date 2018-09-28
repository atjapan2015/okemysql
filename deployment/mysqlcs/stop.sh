#!/bin/bash
kubectl delete -f mysql-all.yml -n mysqlcs
kubectl delete -f mysql-client-job.yml -n mysqlcs
kubectl delete -f k8s-all.yml -n mysqlcs
kubectl delete ns mysqlcs
exit
