#!/bin/bash
kubectl delete -f mysql-all.yml -n mysqloke
kubectl delete -f mysql-client-job.yml -n mysqloke
kubectl delete -f k8s-all.yml -n mysqloke
kubectl delete ns mysqloke
sudo rm -rf /u01/data/var/lib/mysql
exit
