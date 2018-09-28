#!/bin/bash
kubectl delete -f mysql-all.yml -n local
kubectl delete -f mysql-client-job.yml -n local
kubectl delete -f k8s-all.yml -n local
kubectl delete ns local
sudo rm -rf /u01/data/var/lib/mysql
exit
