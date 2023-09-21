def call(Map config){
    properties([parameters([

    choice(name:'branch', choices:['main', 'develop'], description:'choose any branch')
    // booleanParam(name: 'testParam', defaultValue: 'true', description:'select true or false')

    ])])    

    node {
        echo "Select ${config}to ${params} run the Pipeline"
    }
    return config
}
