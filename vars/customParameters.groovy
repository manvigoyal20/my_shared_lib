def call(Map config){
    properties([parameters([

    choice(name:'branch', choices:['main', 'develop'], description:'choose any branch'),
    booleanParam(name: 'testParam', defaultValue: 'true', description:'select true or false'),
    string(name: 'imageName', defaultValue: 'javaapp', description:'name of the image'),
    string(name: 'imageTag', defaultValue: 'v1', description:'tag of the image'),
    string(name: 'dockerhubUser', defaultValue: 'manvigoyal', description:'user name of dockerhub')

    ])])    

    return params
}
