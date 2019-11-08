package com.example.groupview;

public class Group {

    private String groupName;
    private String groupType;
    private int numberOfMembers;
    private int image;

    public Group(String groupName, String groupType, int numberOfMembers, int image) {
        this.groupName = groupName;
        this.groupType = groupType;
        this.numberOfMembers = numberOfMembers;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }
}
