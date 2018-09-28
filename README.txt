# Execute
```sh
./gradlew bootJar
java -jar build/libs/k8s-1.0.0.jar
```

# Access
```sh
curl http://localhost:8090/city/1
curl http://localhost:8090/city/2
...
curl http://localhost:8090/city/4079
```

# base64 encode and decode example
```sh
echo -n test | base64
echo -n dGVzdA== | base64 --decode
```

# Init Kubernetes 1.11
```sh
IP_ADDR=$(ip addr show enp0s8 | grep -Po 'inet \K[\d.]+')
echo $IP_ADDR
sudo kubeadm init --pod-network-cidr=10.244.0.0/16 --apiserver-advertise-address=${IP_ADDR} --kubernetes-version stable-1.11
```

# Taint master as node
```sh
kubectl taint nodes --all node-role.kubernetes.io/master-
```