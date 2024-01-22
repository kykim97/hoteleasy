# 

## Model
www.msaez.io/#/storming/6713ca9bb4ce5572d09b0c4d52f29d91

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- reservation-platform-development
- partnership-management
- marketing-and-advertising
- customer-support-and-assistance
- financial-management


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- reservation-platform-development
```
 http :8088/users name="name" email="email" password="password" 
 http :8088/hotels name="name" location="location" price="price" 
 http :8088/reservations user="user" hotel="hotel" roomType="roomType" paymentDetails="paymentDetails" 
```
- partnership-management
```
 http :8088/hotelPartners name="name" email="email" 
 http :8088/travelAgencies name="name" email="email" 
```
- marketing-and-advertising
```
 http :8088/marketingCampaigns name="name" description="description" 
```
- customer-support-and-assistance
```
 http :8088/customerSupportTickets user="user" message="message" 
```
- financial-management
```
 http :8088/financialReports year="year" month="month" revenue="revenue" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

