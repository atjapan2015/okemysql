#!/bin/bash
kubectl delete -f mysql-all.yml -n remote
kubectl delete -f mysql-client-job.yml -n remote
kubectl delete -f k8s-all.yml -n remote
kubectl delete ns remote
exit
