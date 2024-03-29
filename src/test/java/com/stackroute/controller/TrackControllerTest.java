//package com.stackroute.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.stackroute.domain.Track;
//import com.stackroute.exception.GlobalListener;
//import com.stackroute.exception.TrackAlreadyExistException;
//import com.stackroute.service.TrackServiceImpl;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest
//public class TrackControllerTest {
//    @Autowired
//    private MockMvc mockMvc;
//    private Track track;
//    @MockBean
//    private TrackServiceImpl trackService;
//    @InjectMocks
//    private TrackController trackController;
//
//    private List<Track> list = null;
//
//    @Before
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
////        mockMvc = MockMvcBuilders.standaloneSetup(trackController).build();
//        mockMvc = MockMvcBuilders.standaloneSetup(trackController).setControllerAdvice(new GlobalListener()).build();
//        track = new Track();
//        track.setId(10);
//        track.setTrackName("track");
//        track.setComment("comment1");
//        list = new ArrayList();
//        list.add(track);
//    }
//
//    @Test
//    public void trackSave() throws Exception {
//        when(trackService.trackSave(any())).thenReturn(track);
//        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/track")
//                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
//                .andExpect(MockMvcResultMatchers.status().isCreated())
//                .andDo(MockMvcResultHandlers.print());
//    }
//
//    @Test
//    public void getAllTracks() throws Exception {
//        when(trackService.getAllTrack()).thenReturn(list);
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/tracks")
//                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
//                .andExpect(MockMvcResultMatchers.status().isCreated())
//                .andDo(MockMvcResultHandlers.print());
//    }
//
//    //    @Test
////    public void getTrackByName() throws Exception {
////        when(trackService.(track.getName())).thenReturn(track);
////        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/tracks/name")
////                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
////                .andExpect(MockMvcResultMatchers.status().isOk())
////                .andDo(MockMvcResultHandlers.print());
////    }
//    @Test
//    public void getTrackById() throws Exception {
//        when(trackService.getTrackById(track.getId())).thenReturn(track);
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/track/10")
//                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
//                .andExpect(MockMvcResultMatchers.status().isCreated())
//                .andDo(MockMvcResultHandlers.print());
//    }
//
//    @Test
//    public void deleteTrackById() throws Exception {
//        when(trackService.getTrackById(track.getId())).thenReturn(track);
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/track/10")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers.status().isCreated())
//                .andDo(MockMvcResultHandlers.print());
//    }
//
//    @Test
//    public void saveUserFailure() throws Exception {
//        when(trackService.trackSave(any())).thenThrow(TrackAlreadyExistException.class);
//        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/track")
//                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
//                .andExpect(MockMvcResultMatchers.status().isConflict())
//                .andDo(MockMvcResultHandlers.print());
//    }
//
//    private static String asJsonString(final Object obj) {
//        try {
//            return new ObjectMapper().writeValueAsString(obj);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
//
//
//
