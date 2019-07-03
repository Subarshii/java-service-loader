javac -cp ../store-service/ store/file/*.java -d classes \
&& jar -cvf file-store.jar -C ./classes .