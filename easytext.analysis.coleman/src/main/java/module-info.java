module easytext.analysis.coleman {

    requires easytext.analysis.api;

    provides com.dorwi.easytext.analysis.api.Analyzer
            with com.dorwi.easytext.analysis.coleman.ColemanAnalyzer;

}