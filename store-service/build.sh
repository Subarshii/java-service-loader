javac ./store/api/*.java -d classes \
&& jar -cvf store-api.jar -C ./classes .