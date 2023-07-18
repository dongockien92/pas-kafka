## Create mounted directories
On linux, because the bitnami containers are the non-root containers, we must create and grant permission to mounted directories.
From Bitnami: `As this is a non-root container, the mounted files and directories must have the proper permissions for the UID 1001`.
```
mkdir -p data 
mkdir -p data/zookeeper 
mkdir -p data/kafka
sudo chown -R 1001 data/
```

## Init containers and databases
- Init core containers:
```
src\test\resources\docker > docker compose -p pas --env-file ./pas.env -f docker-compose.yml up --build -d
```