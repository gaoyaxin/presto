package com.facebook.presto.metadata;

import com.google.common.base.Objects;

import java.net.URI;

import static com.google.common.base.Preconditions.checkNotNull;

public class Node
{
    private final String nodeIdentifier;
    private final URI httpUri;

    public Node(String nodeIdentifier, URI httpUri)
    {
        this.nodeIdentifier = checkNotNull(nodeIdentifier, "nodeIdentifier");
        this.httpUri = checkNotNull(httpUri, "httpUri");
    }

    public String getNodeIdentifier()
    {
        return nodeIdentifier;
    }

    public URI getHttpUri()
    {
        return httpUri;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        Node o = (Node) obj;
        return nodeIdentifier.equals(o.nodeIdentifier);
    }

    @Override
    public int hashCode()
    {
        return nodeIdentifier.hashCode();
    }

    @Override
    public String toString()
    {
        return Objects.toStringHelper(this)
                .add("nodeIdentifier", nodeIdentifier)
                .add("httpUri", httpUri)
                .toString();
    }
}