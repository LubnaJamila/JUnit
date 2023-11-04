package com.febri.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VolumeKubusTest {
    private VolumeKubus volumeKubus = new VolumeKubus();

    @Test
    public void Test(){
        //inisialisasi atau pemberian niai sisi
        int sisi = volumeKubus.volumeKubus(10);
        //eksesusi jawaban
        assertEquals(1000,sisi);
    }
}
