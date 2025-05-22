package dk.sdu.mmmi.cbse.scoringapi2;

import dk.sdu.mmmi.cbse.commonscoring.IScoringSPI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class ScoringAPI implements IScoringSPI {
    private RestTemplate restTemplate = new RestTemplate();
    private String url = "http://localhost:8080/score?point=";

    @Override
    public int updateScore(int points) {
        ResponseEntity<String> response = restTemplate.getForEntity(url + points, String.class);
        if (response.getBody() == null) return -1;
        return Integer.parseInt(response.getBody());
    }
}
