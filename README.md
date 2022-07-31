1.Install JDK
2.Signup In Docker and download and install Docker
3.create a simple spring boot application
4.create a simple rest controller
5.create a docker file with name "Dockerfile"
6.write the command in created docker file
7.Go to terminal and root path of your project authenticate docker by “docker login”

DOCKER IMAGE CREATION

8.Build docker image by using command 
“docker build -t <any name>-img .”
9. check docker image by using cmd 
"docker images"

 

Push DOCKER IMAGE

10. First tag docker image using cmd 
"docker tag <any name>-img  <username on docker>/<any name>-img "


 

11) tag one image to latest and another to some other version
“docker tag docker-one-img:latest 9739239812/docker-one-img:v3”

 

12. Push the image by command 
“docker push 9739239812/docker-one-img”
If we don’t specify version, it will take latest one 

 


 


13.Push another version by using command
 “docker push <accountID/<image name:<version name>”
 

 

To remove image from docker use command 
docker rmi <image name>

To pull docker image:
docker run -p <new port number>:<expose port number> <image_name>
ex: docker run -p 8090:8080 ranjan715/application-one-img

we are telling docker to run image on new port as previous port is already exposed and map 8090 to 8080.

 

To check how many containers are running
 “docker ps”

 

To kill container 
Docker kill <container id>

To run another container: 
docker run -p <new port number>:<expose port number> <image_name>


DataBase MongoDB

Pull docker image of mongo db
 

doccker pull mongo:latest

if you want to run something in backend use detach mode (-d)
to publish the port we are using  -p

then create docker container and run-in different port


docker run -d -p <new port number>:<expose port number>  --name mongodb-container-one <image_name>

to link container 
docker run -p <expose port number>:port number --name <name of the container>  --link <container name that is running>:<image name> -d <image name of spring boot>


to debug and see anything in docker 
docker logs <name of running container >

to go inside a running container 
docker exec -it <name of the running container> bash
-it -> integrated terminal 

To force remove of running docker container:
Docker rm -f <name of the running container>
