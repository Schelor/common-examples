package com.zsm.commonexample.model;

import javax.xml.bind.annotation.XmlElement;


/**
 * 服务器配置信息类
 *
 * @Author: zengsm.
 * @Description:
 * @Date:Created in 2018/4/17 23:01.
 * @Modified By:
 */
//@XmlAccessorType(XmlAccessType.FIELD)
public class ServerHostInfo
{
    private String hostname;

    private String ip;

    private int port;

    private String user;

    private String password;

    @XmlElement(name = "hostname")
    public String getHostname()
    {
        return hostname;
    }

    public void setHostname(String hostname)
    {
        this.hostname = hostname;
    }

    public String getIp()
    {
        return ip;
    }

    @XmlElement(name = "ip")
    public void setIp(String ip)
    {
        this.ip = ip;
    }

    public int getPort()
    {
        return port;
    }

    @XmlElement(name = "port")
    public void setPort(int port)
    {
        this.port = port;
    }

    public String getUser()
    {
        return user;
    }

    @XmlElement(name = "user")
    public void setUser(String user)
    {
        this.user = user;
    }

    public String getPassword()
    {
        return password;
    }

    @XmlElement(name = "password")
    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "ServerHostInfo{" +
               "hostname='" + hostname + '\'' +
               ", ip='" + ip + '\'' +
               ", port=" + port +
               ", user='" + user + '\'' +
               ", password='" + password + '\'' +
               '}';
    }
}
