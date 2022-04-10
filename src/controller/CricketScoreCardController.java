
@RestController
@RequestMapping(value=BASE_URL)
public class CricketScoreCardController{
  
 private static final Logger logger = LoggerFactory.getLogger(CricketScoreCardController.class); 
  
  @Autowired
  private CricketScoreService cricketScoreService;
  
  @GetMapping(value=GET_CRICKET_SCORE_CARD)
  public @ResponseBody getCricketScoreCard(){
    
  }
  
  
  
  
  
  
  
}  
  
