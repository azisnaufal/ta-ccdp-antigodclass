/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.dokter.iterator;

import application.dokter.Dokter;

/**
 *
 */
public interface DokterIterator {
    boolean hasNext();
    Dokter next();
}
