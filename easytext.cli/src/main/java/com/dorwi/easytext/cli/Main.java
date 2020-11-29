package com.dorwi.easytext.cli;

import java.util.ServiceLoader;
import com.dorwi.easytext.analysis.api.Analyzer;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<Analyzer> analyzers =
                ServiceLoader.load(Analyzer.class);

        for (Analyzer analyzer: analyzers) {
            System.out.println(analyzer.getName());
        }
    }
}