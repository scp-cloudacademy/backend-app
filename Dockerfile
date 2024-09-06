FROM scr.comm.scp-in.com/sdspaas-cicd-chart-images/nginx:1.25.1-alpine

COPY build /usr/share/nginx/html
