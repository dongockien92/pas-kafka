## Init containers and databases
- Init core containers:
```
src\test\resources\docker > docker compose -p pas --env-file ./pas.env -f docker-compose.yml up --build -d
```