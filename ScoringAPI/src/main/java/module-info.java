import dk.sdu.mmmi.cbse.commonscoring.IScoringSPI;
import dk.sdu.mmmi.cbse.scoringapi2.ScoringAPI;

module ScoringAPI {
    requires CommonScoring;
    requires spring.web;

    provides IScoringSPI with ScoringAPI;
}