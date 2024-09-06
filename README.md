# React Application (Getting Started Guide) 

본 프로젝트는 React Application을 적용하기 위한 템플릿 프로젝트 입니다.

## What's Here
 ```
.
├── src
│   ├── App.js
│   └── index.js
├── public/
├── Dockerfile
└── package.json
```

## Getting Started

### Requirements
- node 14

### Installation and Build
```sh
npm install --no-fund
npm run build
```

### Run app
```sh
npm start
```
[http://localhost:3000](http://localhost:3000)에 접속해서 확인하세요.

### Run container image
```sh
# build
# base container image : nginx
docker build -t react .
# run
docker run --rm -p 8080:80 react
```
[http://localhost:8080](http://localhost:8080)에 접속해서 확인하세요.

### Reference
- [React documentation](https://reactjs.org/)
- [React Tutorial](https://reactjs.org/tutorial/tutorial.html)
