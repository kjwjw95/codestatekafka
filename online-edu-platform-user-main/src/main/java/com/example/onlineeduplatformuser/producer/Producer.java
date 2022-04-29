@Service
public class Producer {
	private static final Logger logger = LoggerFactory.getLogger(Producer.class);
	private static final String TOPIC = "isLogin";

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String message) {
		logger.info("#### -> Producing message -> {}", message);
		this.kafkaTemplate.send(TOPIC, message);
	}
}