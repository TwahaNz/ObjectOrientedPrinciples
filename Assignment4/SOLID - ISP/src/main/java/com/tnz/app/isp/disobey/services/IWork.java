package com.tnz.app.isp.disobey.services;

/**
 * Created by Admin on 3/27/16.
 */
public interface IWork {

    public String work();

    //This introduces a fat interface since class machine doesn't get lunch break
    public String lunchBreak();

}
