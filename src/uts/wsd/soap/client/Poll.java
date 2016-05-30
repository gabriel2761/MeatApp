/**
 * Poll.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uts.wsd.soap.client;

public class Poll  implements java.io.Serializable {
    private int id;

    private java.lang.String title;

    private java.lang.String creatorUsername;

    private java.lang.String creationDate;

    private java.lang.String location;

    private java.lang.String description;

    private boolean open;

    private java.lang.String[] times;

    private uts.wsd.soap.client.Vote[] votes;

    public Poll() {
    }

    public Poll(
           int id,
           java.lang.String title,
           java.lang.String creatorUsername,
           java.lang.String creationDate,
           java.lang.String location,
           java.lang.String description,
           boolean open,
           java.lang.String[] times,
           uts.wsd.soap.client.Vote[] votes) {
           this.id = id;
           this.title = title;
           this.creatorUsername = creatorUsername;
           this.creationDate = creationDate;
           this.location = location;
           this.description = description;
           this.open = open;
           this.times = times;
           this.votes = votes;
    }


    /**
     * Gets the id value for this Poll.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Poll.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the title value for this Poll.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Poll.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the creatorUsername value for this Poll.
     * 
     * @return creatorUsername
     */
    public java.lang.String getCreatorUsername() {
        return creatorUsername;
    }


    /**
     * Sets the creatorUsername value for this Poll.
     * 
     * @param creatorUsername
     */
    public void setCreatorUsername(java.lang.String creatorUsername) {
        this.creatorUsername = creatorUsername;
    }


    /**
     * Gets the creationDate value for this Poll.
     * 
     * @return creationDate
     */
    public java.lang.String getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this Poll.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.lang.String creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the location value for this Poll.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Poll.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the description value for this Poll.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Poll.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the open value for this Poll.
     * 
     * @return open
     */
    public boolean isOpen() {
        return open;
    }


    /**
     * Sets the open value for this Poll.
     * 
     * @param open
     */
    public void setOpen(boolean open) {
        this.open = open;
    }


    /**
     * Gets the times value for this Poll.
     * 
     * @return times
     */
    public java.lang.String[] getTimes() {
        return times;
    }


    /**
     * Sets the times value for this Poll.
     * 
     * @param times
     */
    public void setTimes(java.lang.String[] times) {
        this.times = times;
    }


    /**
     * Gets the votes value for this Poll.
     * 
     * @return votes
     */
    public uts.wsd.soap.client.Vote[] getVotes() {
        return votes;
    }


    /**
     * Sets the votes value for this Poll.
     * 
     * @param votes
     */
    public void setVotes(uts.wsd.soap.client.Vote[] votes) {
        this.votes = votes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Poll)) return false;
        Poll other = (Poll) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.creatorUsername==null && other.getCreatorUsername()==null) || 
             (this.creatorUsername!=null &&
              this.creatorUsername.equals(other.getCreatorUsername()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.open == other.isOpen() &&
            ((this.times==null && other.getTimes()==null) || 
             (this.times!=null &&
              java.util.Arrays.equals(this.times, other.getTimes()))) &&
            ((this.votes==null && other.getVotes()==null) || 
             (this.votes!=null &&
              java.util.Arrays.equals(this.votes, other.getVotes())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getId();
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getCreatorUsername() != null) {
            _hashCode += getCreatorUsername().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isOpen() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTimes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVotes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVotes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVotes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Poll.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.wsd.uts/", "poll"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creatorUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("open");
        elemField.setXmlName(new javax.xml.namespace.QName("", "open"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("times");
        elemField.setXmlName(new javax.xml.namespace.QName("", "times"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "time"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("votes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "votes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.wsd.uts/", "vote"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "vote"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
