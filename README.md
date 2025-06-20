**Kafka**
============================
   - Distributed event streaming platform
	 - like Whatsapp group, each group is topic
 **Why**
		 - Decoupling services
		 - Scalability
		 - Replayability
		 - Efficiency
**Notes**
		- Event Streaming ---> captures the events in real time, sorting them in a log, and allowing others services to access them immediately or later.
		
**Kafka Architecture and Components**
	1.Event ==> is a message sent to Kafka with data.
	1. Producer ==> the sender of the message (application or service which pushing the messages to Kafka topic).
	2. Consumer ==> the one who read the messages(application or service which subscribe to Kafka topic and read the messages).
	3. Topic ==> group chat(orders, notifications)
	4. Partition ==> sub channel in a group for faster delivery to consumers(to enable parallel processing and scaling).
	5. Consumer Group ==> Teams of groups consuming the messages together(sharing the read from the same topic). if they have the same group id one of them will read one event and the others will not read the same event....
	6. Offset ==> bookmark of last message read
	7. Broker ==> Kafka server that store and serve Kafka messages.
	8. Zookeeper ==> Manager (deprecated).


**Kafka Concepts**
	1. Retention ==> How much time to keep failed messages.
	2. Replication ==> Kafka keeps the copies of messages for safety.
	3. Producer Acknowledgement ==> Marks the messages sent successfully.
	4. Dead Letter Queue(DLQ) ==> Place to store failed messages.
	5. Kafka Connect ==> Tool to connect Kafka with database, cloud...
	6. Kafka Streams ==> To process data inside Kafka in real time.
			

Docker CLI
	1. "docker exec -it kafka bash" ===> Take me inside kafka container.
	2. "kafka-topics --create --topic orders --bootstrap-server localhost:9092 --partitions 3 --replication-factor 1 " ===> Creates a topic.
	3.  "kafka-topics --list --bootstrap-server localhost:9092" ===> To list all topics.
	4. "kafka-topics --describe --topic orders bootstrap-server localhost:9092"

Additional:
	- You can use Spring Cloud Stream to can have flexibility to switch from Kafka to RabbitMQ , etc.... without changing a lot of spring code.




Used in Async calls in microservices.
