package com.hortensie.ai_trader.xAPI;
/**
 * Created by Piotr on 2017-01-19.
 * public necessary for FireBase to work
 */

public class Symbol{

    public Long time;

    public SymbolRecord symbolRecord;


    public void setTime(Long time) {
        this.time = time;
    }

    public void setSymbolRecord(SymbolRecord symbolRecord) {
        this.symbolRecord = symbolRecord;
    }

    public Symbol() {
    }

    public Symbol(Long time, SymbolRecord symbolRecord) {
        this.time = time;
        this.symbolRecord = symbolRecord;
    }

    public Long getTime() {
        return time;
    }

    public SymbolRecord getSymbolRecord() {
        return symbolRecord;
    }
}