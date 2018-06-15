package com.github.theresajayne.beatedit.entities;

public class MappingNotes {
    private double _time;
    private int _lineIndex;
    private int _lineLayer;
    private int _type;
    private int _cutDirection;


    public double get_time() {
        return _time;
    }

    public void set_time(double _time) {
        this._time = _time;
    }

    public int get_lineIndex() {
        return _lineIndex;
    }

    public void set_lineIndex(int _lineIndex) {
        this._lineIndex = _lineIndex;
    }

    public int get_lineLayer() {
        return _lineLayer;
    }

    public void set_lineLayer(int _lineLayer) {
        this._lineLayer = _lineLayer;
    }

    public int get_type() {
        return _type;
    }

    public void set_type(int _type) {
        this._type = _type;
    }

    public int get_cutDirection() {
        return _cutDirection;
    }

    public void set_cutDirection(int _cutDirection) {
        this._cutDirection = _cutDirection;
    }
}
