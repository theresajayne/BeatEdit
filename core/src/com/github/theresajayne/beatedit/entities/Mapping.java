package com.github.theresajayne.beatedit.entities;

import java.util.List;

/**
 * container for the track details including all blocks and cuts
 */
public class Mapping {
    private String name;
    private String _version;
    private int _beatsPerMinute;
    private int _beatsPerBar;
    private int _noteJumpSpeed;
    private double _shuffle;
    private double _shufflePeriod;
    private List<MappingEvents> _events;
    private List<MappingNotes> _notes;
    private List<MappingObstacles> _obstacles;

    @Override
    public String toString() {
        return "Mapping name= "+name+"{" +
                "_version='" + _version + '\'' +
                ", _beatsPerMinute=" + _beatsPerMinute +
                ", _beatsPerBar=" + _beatsPerBar +
                ", _noteJumpSpeed=" + _noteJumpSpeed +
                ", _shuffle=" + _shuffle +
                ", _shufflePeriod=" + _shufflePeriod +
                '}';
    }

    public String get_version() {
        return _version;
    }

    public void set_version(String _version) {
        this._version = _version;
    }

    public int get_beatsPerMinute() {
        return _beatsPerMinute;
    }

    public void set_beatsPerMinute(int _beatsPerMinute) {
        this._beatsPerMinute = _beatsPerMinute;
    }

    public int get_beatsPerBar() {
        return _beatsPerBar;
    }

    public void set_beatsPerBar(int _beatsPerBar) {
        this._beatsPerBar = _beatsPerBar;
    }

    public int get_noteJumpSpeed() {
        return _noteJumpSpeed;
    }

    public void set_noteJumpSpeed(int _noteJumpSpeed) {
        this._noteJumpSpeed = _noteJumpSpeed;
    }

    public double get_shuffle() {
        return _shuffle;
    }

    public void set_shuffle(double _shuffle) {
        this._shuffle = _shuffle;
    }

    public double get_shufflePeriod() {
        return _shufflePeriod;
    }

    public void set_shufflePeriod(double _shufflePeriod) {
        this._shufflePeriod = _shufflePeriod;
    }


    public List<MappingEvents> get_events() {
        return _events;
    }

    public void set_events(List<MappingEvents> _events) {
        this._events = _events;
    }

    public List<MappingNotes> get_notes() {
        return _notes;
    }

    public void set_notes(List<MappingNotes> _notes) {
        this._notes = _notes;
    }

    public List<MappingObstacles> get_obstacles() {
        return _obstacles;
    }

    public void set_obstacles(List<MappingObstacles> _obstacles) {
        this._obstacles = _obstacles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
