# java-factorial

# Compilar
    gradle build
# build images
    docker build -t factorialjava:1.0 .
# run images
    docker run -p 3000:3000 factorialjava:1.0
# test
    http://localhost:3000/factorial/20
    