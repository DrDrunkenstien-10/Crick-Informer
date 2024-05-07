package com.crick.apis.services;

import com.crick.apis.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    //Get all matches
    List<Match> getAllMatches();

    //Get live matches
    List<Match> getLiveMatches();

    //Points Tables
    List<List<String>> getPointsTable();




}
