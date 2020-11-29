module easytext.analysis.kincaid {

    requires easytext.analysis.api;

    provides com.dorwi.easytext.analysis.api.Analyzer
            with com.dorwi.easytext.analysis.kincaid.KincaidAnalyzer;

}