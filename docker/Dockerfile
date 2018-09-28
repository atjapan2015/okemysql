FROM atjapan2015/jdk8:181

RUN mkdir /prod
ADD ./k8s-1.0.0.jar /prod

CMD ["java","-jar","/prod/k8s-1.0.0.jar"]