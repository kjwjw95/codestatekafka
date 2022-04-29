@Service
public class Consumer {
	private final Logger logger = LoggerFactory.getLogger(Consumer.class);

	@KafkaListener(topics = "isLogin", groupId = "group_id")
	public void consume(String message) {
		logger.info("#### -> Consumed message -> {}", message);
	}
}
