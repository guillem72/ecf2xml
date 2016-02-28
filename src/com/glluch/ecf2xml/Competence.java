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

import java.util.HashMap;

/**
 *
 * @author Guillem LLuch Moll guillem72@gmail.com
 */
public class Competence {

    private String description;
    private String group;
    private String title;
    private String code;
    private HashMap<Integer, String> levels;
    private HashMap<String, String> knowledges;
    private HashMap<String, String> skills;

    public Competence(String group, String title, String code) {
        this.group = group;
        this.title = title;
        this.code = code;
        this.levels = new HashMap<>();
        this.knowledges = new HashMap<>();
        this.skills = new HashMap<>();
    }

    public void add(String what, String value) {
        if (what.equals("description")) {
            description = value;
        }
        if (what.equals("gropu")) {
            group = value;
        }
        if (what.equals("title")) {
            title = value;
        }
        if (what.equals("code")) {
            code = value;
        }

    }

    public void addSkill(String id, String skill) {
        skills.put(id, skill);
    }

    public void addLevel(int level, String desc) {
        levels.put(level, desc);
    }

    public void addKnow(String id, String k) {
        knowledges.put(id, k);
    }

    public HashMap<Integer, String> getLevels() {
        return levels;
    }

    public HashMap<String, String> getKnowledges() {
        return knowledges;
    }

    public HashMap<String, String> getSkills() {
        return skills;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        String info = "";
        info += "Title:" + title;
        info += "\nDescription:" + description;
        info+="\nlevels:\n"+levels.toString();
        return info;
    }

}
