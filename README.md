# Video Streaming API

Service to publish videos, handle their metadata and handle the view and impression metrics.

## Development
### Requirements:
- JDK 17
- Maven
- Git

Clone repo on your local machine
```
git clone git@github.com:szymonleyk/video-streaming-api.git
```
Run application
```
mvn spring-boot:run
```
Application runs on 8080 port. Look below to the documentation for more information.

## Test
Run command
```
 mvn spring-boot:test-run
```

## Documentation
- [API doc](http://localhost:8080/swagger-ui.html)
- [Database console](http://localhost:8080/h2-console/)
  - User Name: user
  - Password: pass

### Examples
1. Publish a video
```
curl -X 'POST' \
  'http://localhost:8080/api/videos' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "content": "111111111111"
}'
```
```
Response : 1
 ```

2. Add metadata
```
curl -X 'POST' \
  'http://localhost:8080/api/videos/1/metadata' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "title": "string",
  "synopsis": "string",
  "director": "string",
  "yearOfRelease": 0,
  "genre": "string",
  "runningTime": 0
}'
```

3. Edit metadata
```
curl -X 'PUT' \
  'http://localhost:8080/api/videos/1/metadata' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": 1,
  "title": "string444",
  "synopsis": "string444",
  "director": "string",
  "yearOfRelease": 0,
  "genre": "string",
  "runningTime": 0
}'
```
4. Delist 
```
curl -X 'DELETE' \
  'http://localhost:8080/api/videos/1' \
  -H 'accept: */*'
```

5. Load video
```
curl -X 'GET' \
'http://localhost:8080/api/videos/1/load' \
-H 'accept: */*'
```

6. Play video
```
curl -X 'GET' \
  'http://localhost:8080/api/videos/1/play' \
  -H 'accept: */*'
```

7. List all available videos
```
curl -X 'GET' \
  'http://localhost:8080/api/videos/metadata' \
  -H 'accept: */*'
```

