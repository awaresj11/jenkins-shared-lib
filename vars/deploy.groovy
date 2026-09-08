def call(String composeFile = "docker-compose.yml"){
  sh """
     echo "stopping old containers.."
     docker compose -f ${composeFile} down

     echo "Starting Containers.."
     docker compose -f ${composeFile} up -d
     """
}
