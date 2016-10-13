package com.example.pablo.tipcalc.fragments;

import com.example.pablo.tipcalc.models.TipRecord;

/**
 * Created by pablo on 10/10/16.
 */

public interface TipHistoryListFragmentListener {

   void addToList(TipRecord record);
    void clearList();

}
