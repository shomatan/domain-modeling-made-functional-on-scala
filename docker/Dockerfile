FROM oracle/graalvm-ce:19.0.0

RUN gu install native-image

WORKDIR /work

ENTRYPOINT ["native-image"]

CMD ["--help"]