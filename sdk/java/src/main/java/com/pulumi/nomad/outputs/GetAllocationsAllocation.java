// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.nomad.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAllocationsAllocation {
    /**
     * @return `(string)` - The current client status of the allocation.
     * 
     */
    private String clientStatus;
    /**
     * @return `(int)` - The Raft index in which the allocation was created.
     * 
     */
    private Integer createIndex;
    /**
     * @return `(int)` - The timestamp of when the allocation was created.
     * 
     */
    private Integer createTime;
    /**
     * @return `(string)` - The current desired status of the allocation.
     * 
     */
    private String desiredStatus;
    /**
     * @return `(string)` - The ID of the evaluation that generated the allocation.
     * 
     */
    private String evalId;
    /**
     * @return `(string)` - The ID of the evaluation that succeeds the allocation evaluation.
     * 
     */
    private String followupEvalId;
    /**
     * @return `(string)` - The ID of the allocation.
     * 
     */
    private String id;
    /**
     * @return `(string)` - The ID of the job related to the allocation.
     * 
     */
    private String jobId;
    /**
     * @return `(string)` - The type of the job related to the allocation.
     * 
     */
    private String jobType;
    /**
     * @return `(int)` - The version of the job that generated the allocation.
     * 
     */
    private Integer jobVersion;
    /**
     * @return `(int)` - The Raft index in which the allocation was last modified.
     * 
     */
    private Integer modifyIndex;
    /**
     * @return `(int)` - The timestamp of when the allocation was last modified.
     * 
     */
    private Integer modifyTime;
    /**
     * @return `(string)` - The name of the allocation.
     * 
     */
    private String name;
    /**
     * @return `(string: &lt;optional&gt;)` - Specifies the namespace to search for
     * allocations in.
     * 
     */
    private String namespace;
    /**
     * @return `(string)` - The ID of the allocation that succeeds the allocation.
     * 
     */
    private String nextAllocation;
    /**
     * @return `(string)` - The ID of the node to which the allocation was scheduled.
     * 
     */
    private String nodeId;
    /**
     * @return `(string)` - The ID of the node to which the allocation was scheduled.
     * 
     */
    private String nodeName;
    /**
     * @return `(string)` - The ID of the allocation that preempted the allocation.
     * 
     */
    private String preemptedByAllocation;
    /**
     * @return `(string)` - The job task group related to the allocation.
     * 
     */
    private String taskGroup;

    private GetAllocationsAllocation() {}
    /**
     * @return `(string)` - The current client status of the allocation.
     * 
     */
    public String clientStatus() {
        return this.clientStatus;
    }
    /**
     * @return `(int)` - The Raft index in which the allocation was created.
     * 
     */
    public Integer createIndex() {
        return this.createIndex;
    }
    /**
     * @return `(int)` - The timestamp of when the allocation was created.
     * 
     */
    public Integer createTime() {
        return this.createTime;
    }
    /**
     * @return `(string)` - The current desired status of the allocation.
     * 
     */
    public String desiredStatus() {
        return this.desiredStatus;
    }
    /**
     * @return `(string)` - The ID of the evaluation that generated the allocation.
     * 
     */
    public String evalId() {
        return this.evalId;
    }
    /**
     * @return `(string)` - The ID of the evaluation that succeeds the allocation evaluation.
     * 
     */
    public String followupEvalId() {
        return this.followupEvalId;
    }
    /**
     * @return `(string)` - The ID of the allocation.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return `(string)` - The ID of the job related to the allocation.
     * 
     */
    public String jobId() {
        return this.jobId;
    }
    /**
     * @return `(string)` - The type of the job related to the allocation.
     * 
     */
    public String jobType() {
        return this.jobType;
    }
    /**
     * @return `(int)` - The version of the job that generated the allocation.
     * 
     */
    public Integer jobVersion() {
        return this.jobVersion;
    }
    /**
     * @return `(int)` - The Raft index in which the allocation was last modified.
     * 
     */
    public Integer modifyIndex() {
        return this.modifyIndex;
    }
    /**
     * @return `(int)` - The timestamp of when the allocation was last modified.
     * 
     */
    public Integer modifyTime() {
        return this.modifyTime;
    }
    /**
     * @return `(string)` - The name of the allocation.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return `(string: &lt;optional&gt;)` - Specifies the namespace to search for
     * allocations in.
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return `(string)` - The ID of the allocation that succeeds the allocation.
     * 
     */
    public String nextAllocation() {
        return this.nextAllocation;
    }
    /**
     * @return `(string)` - The ID of the node to which the allocation was scheduled.
     * 
     */
    public String nodeId() {
        return this.nodeId;
    }
    /**
     * @return `(string)` - The ID of the node to which the allocation was scheduled.
     * 
     */
    public String nodeName() {
        return this.nodeName;
    }
    /**
     * @return `(string)` - The ID of the allocation that preempted the allocation.
     * 
     */
    public String preemptedByAllocation() {
        return this.preemptedByAllocation;
    }
    /**
     * @return `(string)` - The job task group related to the allocation.
     * 
     */
    public String taskGroup() {
        return this.taskGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAllocationsAllocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientStatus;
        private Integer createIndex;
        private Integer createTime;
        private String desiredStatus;
        private String evalId;
        private String followupEvalId;
        private String id;
        private String jobId;
        private String jobType;
        private Integer jobVersion;
        private Integer modifyIndex;
        private Integer modifyTime;
        private String name;
        private String namespace;
        private String nextAllocation;
        private String nodeId;
        private String nodeName;
        private String preemptedByAllocation;
        private String taskGroup;
        public Builder() {}
        public Builder(GetAllocationsAllocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientStatus = defaults.clientStatus;
    	      this.createIndex = defaults.createIndex;
    	      this.createTime = defaults.createTime;
    	      this.desiredStatus = defaults.desiredStatus;
    	      this.evalId = defaults.evalId;
    	      this.followupEvalId = defaults.followupEvalId;
    	      this.id = defaults.id;
    	      this.jobId = defaults.jobId;
    	      this.jobType = defaults.jobType;
    	      this.jobVersion = defaults.jobVersion;
    	      this.modifyIndex = defaults.modifyIndex;
    	      this.modifyTime = defaults.modifyTime;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.nextAllocation = defaults.nextAllocation;
    	      this.nodeId = defaults.nodeId;
    	      this.nodeName = defaults.nodeName;
    	      this.preemptedByAllocation = defaults.preemptedByAllocation;
    	      this.taskGroup = defaults.taskGroup;
        }

        @CustomType.Setter
        public Builder clientStatus(String clientStatus) {
            if (clientStatus == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "clientStatus");
            }
            this.clientStatus = clientStatus;
            return this;
        }
        @CustomType.Setter
        public Builder createIndex(Integer createIndex) {
            if (createIndex == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "createIndex");
            }
            this.createIndex = createIndex;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(Integer createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder desiredStatus(String desiredStatus) {
            if (desiredStatus == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "desiredStatus");
            }
            this.desiredStatus = desiredStatus;
            return this;
        }
        @CustomType.Setter
        public Builder evalId(String evalId) {
            if (evalId == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "evalId");
            }
            this.evalId = evalId;
            return this;
        }
        @CustomType.Setter
        public Builder followupEvalId(String followupEvalId) {
            if (followupEvalId == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "followupEvalId");
            }
            this.followupEvalId = followupEvalId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder jobId(String jobId) {
            if (jobId == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "jobId");
            }
            this.jobId = jobId;
            return this;
        }
        @CustomType.Setter
        public Builder jobType(String jobType) {
            if (jobType == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "jobType");
            }
            this.jobType = jobType;
            return this;
        }
        @CustomType.Setter
        public Builder jobVersion(Integer jobVersion) {
            if (jobVersion == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "jobVersion");
            }
            this.jobVersion = jobVersion;
            return this;
        }
        @CustomType.Setter
        public Builder modifyIndex(Integer modifyIndex) {
            if (modifyIndex == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "modifyIndex");
            }
            this.modifyIndex = modifyIndex;
            return this;
        }
        @CustomType.Setter
        public Builder modifyTime(Integer modifyTime) {
            if (modifyTime == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "modifyTime");
            }
            this.modifyTime = modifyTime;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(String namespace) {
            if (namespace == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "namespace");
            }
            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder nextAllocation(String nextAllocation) {
            if (nextAllocation == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "nextAllocation");
            }
            this.nextAllocation = nextAllocation;
            return this;
        }
        @CustomType.Setter
        public Builder nodeId(String nodeId) {
            if (nodeId == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "nodeId");
            }
            this.nodeId = nodeId;
            return this;
        }
        @CustomType.Setter
        public Builder nodeName(String nodeName) {
            if (nodeName == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "nodeName");
            }
            this.nodeName = nodeName;
            return this;
        }
        @CustomType.Setter
        public Builder preemptedByAllocation(String preemptedByAllocation) {
            if (preemptedByAllocation == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "preemptedByAllocation");
            }
            this.preemptedByAllocation = preemptedByAllocation;
            return this;
        }
        @CustomType.Setter
        public Builder taskGroup(String taskGroup) {
            if (taskGroup == null) {
              throw new MissingRequiredPropertyException("GetAllocationsAllocation", "taskGroup");
            }
            this.taskGroup = taskGroup;
            return this;
        }
        public GetAllocationsAllocation build() {
            final var _resultValue = new GetAllocationsAllocation();
            _resultValue.clientStatus = clientStatus;
            _resultValue.createIndex = createIndex;
            _resultValue.createTime = createTime;
            _resultValue.desiredStatus = desiredStatus;
            _resultValue.evalId = evalId;
            _resultValue.followupEvalId = followupEvalId;
            _resultValue.id = id;
            _resultValue.jobId = jobId;
            _resultValue.jobType = jobType;
            _resultValue.jobVersion = jobVersion;
            _resultValue.modifyIndex = modifyIndex;
            _resultValue.modifyTime = modifyTime;
            _resultValue.name = name;
            _resultValue.namespace = namespace;
            _resultValue.nextAllocation = nextAllocation;
            _resultValue.nodeId = nodeId;
            _resultValue.nodeName = nodeName;
            _resultValue.preemptedByAllocation = preemptedByAllocation;
            _resultValue.taskGroup = taskGroup;
            return _resultValue;
        }
    }
}
