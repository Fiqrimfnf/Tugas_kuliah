/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_5.Tugas.Graph_DSF;

/**
 *
 * @author Maulana
 */
class Vertex {

    public char label;       
    public boolean wasVisited;

    public Vertex(char lab) 
    {
        label = lab;
        wasVisited = false;
    }
} 
