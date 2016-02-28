/*
 * Copyright (C) 2016 Guillem LLuch Moll guillem72@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.glluch.ecf2xml;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Guillem LLuch Moll guillem72@gmail.com
 */
public class Utils {

    public static boolean match(String patString, String text) {
        Pattern pat = Pattern.compile(patString);
        Matcher matcher = pat.matcher(text);

        int count = 0;
        while (count <=0 && matcher.find()) {
            count++;           
        }
        return (count>0);
    }
    
    public static String join(String[] parts, int offset){
        int i=offset;
        String join="";
        while (i<parts.length){
            if (join.isEmpty()) join=parts[i++];
            else   join=join+" "+parts[i++];
        }
        return join;
    }
    
    public static String join(String[] parts){
    return join(parts,0);
    }
    
    public static void echo(Object text){
    System.out.println(text.toString());
    }

}
