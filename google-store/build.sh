javac -cp ../store-service/ store/google/*.java -d classes \
&& jar -cvf google-store.jar -C ./classes .
