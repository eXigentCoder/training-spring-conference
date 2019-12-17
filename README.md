DATA: https://github.com/dlbunker/ps-first-spring-boot-app

- > docker create --name postgres-demo -e POSTGRES_PASSWORD=Welcome -p 5432:5432 postgres
- > docker start postgres-demo
- > docker stop postgres-demo


## Environments

> run with VM option -Dspring.profiles.active=dev

## App urls

- http://localhost:8080/ - JSP rendered page
- http://localhost:8080/api/v1/ - API home page, returns app version
- http://localhost:8080/api/v1/speakers/1 - returns the first speaker from the DB. currently infinite due to issue.
- http://localhost:8080/css/main.css - statically served css file.
- http://localhost:8080/img/beer.jpg - statically served image file.
- http://localhost:8080/pdf/helloworld.pdf - statically served pdf file.
- http://localhost:8080/attendee - Attendee crud page