FROM node:20-alpine

WORKDIR /app
COPY ../board-fe /app

RUN rm yarn.lock
RUN yarn
RUN yarn build

EXPOSE 3000

ENTRYPOINT ["yarn", "dev"]